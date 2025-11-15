import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        boolean isRunning = true;

        int totalBook = 0;
        double totalPrice = 0;

        while (isRunning)
        {
            /*if (JOptionPane.showInputDialog("\nAdd books?\n\nYes | Quit") == "Yes")
            {
                int _totalBook = 0;
                double _totalPrice = 0;

                if (JOptionPane.showInputDialog("Add Science or Math book?") == "Science")
                {
                    int sciBooks = 0;
                    double sciBookVal = 0;
                    //Get number of books?
                    //Get value?

                    if (sciBooks > 0)
                    {
                        double sciBookTotalVal = (sciBooks*sciBookVal) * 0.9;
                        totalBook += sciBooks;
                        totalPrice += sciBookTotalVal;
                    }
                } else if (JOptionPane.showInputDialog("Add Science or Math book?") == "Math") {
                    int mathBooks = 0;
                    double mathBookVal = 0;
                    //Get number of books?
                    //Get value?

                    if (mathBooks > 0)
                    {
                        totalBook += mathBooks;
                        totalPrice += mathBookVal;
                    }
                }

                if (totalBook != _totalBook)
                {
                    JOptionPane.showMessageDialog();
                }
            } else if (System.in.toString() == "Quit") {
                isRunning = false;
            }*/

            String opt = JOptionPane.showInputDialog("Select an option\n\nC : Create Book\nQ : Quit");

            if (opt.equals("C"))
            {
                String genre = JOptionPane.showInputDialog("Select a genre\n\nS : Science\nM : Math");
                if (genre.equals("S"))
                {
                    Book book = new ScienceBook();
                    book.setTitle(JOptionPane.showInputDialog("Enter the title for the book"));
                    book.setDesc(JOptionPane.showInputDialog("Enter the description for the book"));
                    book.setAuth(JOptionPane.showInputDialog("Enter the book's author"));
                    book.setPub(JOptionPane.showInputDialog("Enter the book's publisher"));
                    //book.setPrice(); //Get price from input somehow...
                    book.setIsbn(JOptionPane.showInputDialog("Enter the book's Isbn"));
                    //book.setYear(); //...

                    totalBook++;
                    //totalPrice += book.price * 0.9;

                    JOptionPane.showMessageDialog(null,book.toString() + "\nTotal Books: " +
                            totalBook + "\nTotal Price: " + totalPrice);
                } else if (genre.equals("M")) {
                    Book book = new MathBook();
                    book.setTitle(JOptionPane.showInputDialog("Enter the title for the book"));
                    book.setDesc(JOptionPane.showInputDialog("Enter the description for the book"));
                    book.setAuth(JOptionPane.showInputDialog("Enter the book's author"));
                    book.setPub(JOptionPane.showInputDialog("Enter the book's publisher"));
                    //book.setPrice(); //Get price from input somehow...
                    book.setIsbn(JOptionPane.showInputDialog("Enter the book's Isbn"));
                    //book.setYear(); //...

                    totalBook++;
                    //totalPrice += book.price;

                    JOptionPane.showMessageDialog(null,book.toString() + "\nTotal Books: " +
                            totalBook + "\nTotal Price: " + totalPrice);
                }
            } else if (opt.equals("Q")) {
                isRunning = false;
            }
        }
    }
}
