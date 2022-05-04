package Repository;



import entity.Account;
import entity.TDetails;
import java.util.List; 
import entity.AccDetails;

public interface AccountRepository {
	void save(AccDetails accdetails);
	Account load(String accNumber);
	void update(Account account);
	public void tsave(TDetails tdetails);
	public List<TDetails> getTransfer();
	public List<AccDetails> getAccDetails(int n1);
	void edit(int n1);
	public void delete(int id);
	public int count();
	public int countAcc();

}
