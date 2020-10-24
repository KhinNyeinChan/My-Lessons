import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RMIInterface extends Remote {

    Book findBook(Book b) throws RemoteException;
    List<Book> allBooks() throws RemoteException;

}