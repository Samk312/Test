package com.trainining.day22.threads;
public class ThreadsInJava1
{
    public static void main(String[] args)
    {
        DaemonThread daemon = new DaemonThread();   //Creating the DaemonThread
        daemon.start();                 //Starting the daemon thread
        UserThread userThread = new UserThread();   //Creating the UserThread
        userThread.start();          //Starting the user thread
    }
}