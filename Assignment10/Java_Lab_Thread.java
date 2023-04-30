class Java_Lab_Thread extends Thread {
    
    public void run() {
        System.out.println("Thread is running.");
    }
    
    public static void main(String[] args) {
        Java_Lab_Thread thread = new Java_Lab_Thread();
        
        // start the thread
        thread.start();
        
        // check if the thread is alive
        System.out.println("Is thread alive? " + thread.isAlive());
        
        // set the thread name
        thread.setName("MyThread");
        System.out.println("Thread name: " + thread.getName());
        
        // get the thread priority
        System.out.println("Thread priority: " + thread.getPriority());
        
        // set the thread priority
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread priority: " + thread.getPriority());
        
        // wait for the thread to complete
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // check if the thread is alive after completion
        System.out.println("Is thread alive? " + thread.isAlive());
    }
}