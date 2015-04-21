package com.healthcode.dto;

import java.util.List;

/**
 * @author Gopal Gorthi
 * @param <T>
 *
 */
public class ResponseMessage<T> {
	
	public enum Type {
		success, warning, error, info;
	}

	private Type type;
	
	private String text;
	
	private List<T> result;

	private ResponseMessage(Builder<T> builder) {
        this.type=builder.type;
        this.text=builder.text;
        this.result=builder.result;
    }
	
	public void setType(Type type) {
		this.type = type;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public Type getType() {
		return type;
	}

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}
	
	public static class Builder<T> {
	
		private Type type;
		
		private String text;
		
		private List<T> result;
		
		public Builder()
		{
			
		}
		public Builder<T> success(String text) {
			this.type = Type.success;
			this.text = text;
			return this;
		}

		public Builder<T> setResult(List<T> result) {
			this.result = result;
			return this;
		}

		public Builder<T> warning(String text) {
			this.type = Type.warning;
			this.text = text;
			return this;
		}

		public Builder<T> error(String text) {
			this.type = Type.error;
			this.text = text;
			return this;
		}

		public Builder<T> info(String text) {
			this.type = Type.info;
			this.text = text;
			return this;
		}

		public ResponseMessage<T> build() {
			return new ResponseMessage<T>(this);
		}
	}
}
