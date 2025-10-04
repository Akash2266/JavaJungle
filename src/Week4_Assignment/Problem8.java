package Week4_Assignment;

  interface Playable {
        abstract void play ();
        abstract void pause ();
  }

     class AudioPlayer implements Playable{
          @Override
           public void play (){
              System.out.println("Playing the audio player");
          }
          @Override
         public void pause (){
              System.out.println("Pausing the audio player");
          }

     }

       class VideoPlayer implements Playable{
           @Override
           public void play (){
               System.out.println("Playing the video player");
           }
           @Override
           public void pause (){
               System.out.println("Pausing the video player");
           }

       }

public class Problem8 {
    public static void main(String[] args) {
        Playable playable = new AudioPlayer();
        playable.pause();
        playable.play();

        System.out.println();

        playable = new VideoPlayer();
        playable.play();
        playable.pause();
    }
}
