package com.example.guiwithjdk8;

public class Friend
{
        private String name;
        private String phoneNumber;
        private String job;

    // requires: name, phoneNumber, and job are non-null strings
    // modifies: this.name, this.phoneNumber, this.job
    // effects: initializes a Friend object with the given name, phoneNumber, and job
    Friend(String name,String phoneNumber, String job)
        {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.job = job;
        }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getJob()
    {
        return job;
    }

    public void setJob(String job)
    {
        this.job = job;
    }

    public String toString()
    {
        return name;
    }
}
