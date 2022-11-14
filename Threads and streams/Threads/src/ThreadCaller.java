public class ThreadCaller {
    public  static  void  main(String[] args) throws InterruptedException {

        ThreadCaller threadCaller= new ThreadCaller();
        ChildThread childThread = new ChildThread();
        childThread.start();
        //childThread.join();//ithu childThread run agura varaikkum wait pannum.next vera thread run agum
        childThread.interrupt();//sleeping or waiting thread a distrub pannum
        for (int i = 1; i <= 5; i++) {
            //  childThread.interrupt();
            System.out.println("parent thread " + i);
        }
    }
}
