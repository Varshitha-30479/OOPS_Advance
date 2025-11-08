/*A game app frequently creates temporary Player objects 
 * during gameplay and destroys them when not needed.
 * Create a Player class and override finalize() to print when it is garbage collected.
 * In main, create several temporary player objects inside a loop.
 * Use System.gc() and explain when objects are eligible for GC.
*/
package Module_1;

public class Q4 {

    static class Player {
        private String name;

        public Player(String name) {
            this.name = name;
            System.out.println("Player " + name + " created.");
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("💀 Player " + name + " is being garbage collected...");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Player p = new Player("P" + i); 
 
        }

        System.out.println("Requesting garbage collection...");
        System.gc();

        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of program.");
    }
}
