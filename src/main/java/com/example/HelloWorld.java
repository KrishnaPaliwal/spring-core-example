package com.example;

public class HelloWorld {
    private String message;
    private String email;
    private HelloCity helloCity;
    
    public void initMethod() {
    	System.out.println("init method called");
    }
    
    public void destroyMethod() {
    	System.out.println("destroy method called");
    }
    
    public HelloCity getHelloCity() {
		return helloCity;
	}

	public void setHelloCity(HelloCity helloCity) {
		this.helloCity = helloCity;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMessage(String message) {
        this.message = message;
    }

    public String getEmail() {
		return email;
	}

	public void printMessage() {
        System.out.println(message);
    }
}
