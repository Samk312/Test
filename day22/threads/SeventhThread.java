package com.trainining.day22.threads;

public class SeventhThread {
	public static void main(String[] args)
    {
        Thread t = new Thread()
        {
            public void run()
            {
                 System.out.println(Thread.currentThread().getName());    //Output : main
            }
        };
 
       // t.run();
      //Note : when you are calling run() directly it is not called by Thread t, 
     // it is called by main thread.  -- Hence above output :
        // Output : main
        t.start();
      //Note : when you are calling start() it is called by Thread t, 
        //output : thread-0
      
    }
}

