<h3>MyThread Java Program</h3>
The program creates a thread by extending the Thread class and overriding the run() method to define the thread's behavior. The run() method simply prints a message to the console to indicate that the thread is running.

In the main() method of the MyThread class, a new MyThread object is created and started using the start() method. The program then uses various methods of the thread object to check its status and modify its behavior. The isAlive() method is used to check if the thread is still running, and the setName() method is used to set the thread's name. The getPriority() and setPriority() methods are used to get and set the thread's priority, respectively.

Finally, the join() method is used to wait for the thread to complete before checking its status again with the isAlive() method.
