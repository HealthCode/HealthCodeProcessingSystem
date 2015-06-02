package com.healthcode.security.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.stereotype.Service;

import com.healthcode.security.dao.UserProfileRepository;
import com.healthcode.security.entity.UserProfile;

@Service
public class HealthCodeAuthProvider implements AuthenticationProvider{
	@Autowired
	UserProfileRepository userProfileRepository;
	
	@Override
	public Authentication authenticate(Authentication authentication)
			 {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();
 
        // use the credentials to try to authenticate against the third party system
        try {
        	UserProfile userProfile = authenticationService(username, password);
			if (userProfile!=null) {
				GrantedAuthority g1 = new GrantedAuthorityImpl(userProfile.getRoles());
				
			    List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
			    grantedAuths.add(g1);
			    
			    return new UsernamePasswordAuthenticationToken(username, password, grantedAuths);
			} else {
				return null;
			    //throw new AuthenticationException("Unable to auth against third party systems");
			}
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
      }
	@Override
	public boolean supports(Class<?> authentication) {
			// TODO Auto-generated method stub
		 return authentication.equals(UsernamePasswordAuthenticationToken.class);
		}
	
	private UserProfile authenticationService(String username, String password) throws NoSuchAlgorithmException, IOException
	{
			boolean success = false;
			UserProfile userProfile = userProfileRepository.getUserByUserName(username);
			if(userProfile!=null)
				success = Encryptor.validateCredentials(userProfile.getPassword(), userProfile.getSalt(), password);
			if(success)
				return userProfile;
			return null;
	}
	
	public boolean registerUser(String userName, String password, String roles) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		UserProfile userProfile = Encryptor.getUserWithEncryptedPasswordAndSalt(userName, password);
		userProfile.setRoles(roles);
		UserProfile existingUserProfile = userProfileRepository.getUserByUserName(userName);
		if(existingUserProfile==null)
		{
			userProfileRepository.createUser(userProfile);
			return true;
		}
		else
		{
			return false;
		}
	}
}
