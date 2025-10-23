import javax.swing.SwingUtilities;
public class Runner {
    public static void main(String[] args) throws Exception {
        
        SwingUtilities.invokeLater(Tutorial::new);
    }
}
