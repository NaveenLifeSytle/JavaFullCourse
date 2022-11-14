public class ChildThread extends  Thread {

    @Override
    public void run() {

        for (int i=1;i<=5;i++){
           // Thread.yield();// ithu bus la periyavangalukku vazhi vittu nikkarathu mathiri,avanga pona aprom next nama povom
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("my sleep got intrerrupted");
            }
            System.out.println("Child thread "+i);
        }
    }
}
