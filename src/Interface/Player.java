package Interface;

 class Player implements Playable,Recordable {
     @Override
     public void play() {
         System.out.println("PLAY");

     }

     @Override
     public void record() {
         System.out.println("RECORD");

     }

     @Override
     public void pause() {
         System.out.println("PAUSE");

     }

     @Override
     public void stop() {
         System.out.println("STOP");

     }

     public static void main(String[] args) {
         Player player = new Player();
         player.play();
         player.record();
         player.pause();
         player.stop();
     }
 }
