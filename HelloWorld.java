
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
	  System.out.println();
          System.out.println("           ******           *************        **********");
          System.out.println("           **    **                **            **");
          System.out.println("           **     **               **            **");
          System.out.println("           **      **              **            **");
          System.out.println("           **      **              **            ********");
          System.out.println("           **      **       **     **            **");
          System.out.println("           **     **         **    **            **");
          System.out.println("           **    **           **  **             **");
          System.out.println("           *****               ****              **********");
          System.out.println();
         piramit();
       }
   public class piramit ()
   {
    for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

	}

}
