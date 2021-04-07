public class Tv extends ServiceCommunicator{
    /*
         iTunesTool - contacts iTunes server and returns artist information.
    */
    public Tv (String showname) {
        super("http://api.tvmaze.com/singlesearch/shows?q=" + showname);
    }

    /*
        Main method - just tests this class in isolation.  Normally you would have another class call iTunesTool
    */
        public static void main(String[] argv) {
            System.out.println(new Tv("star-trek").get());
            System.out.println(new Tv("chappell").get());
        }
}
