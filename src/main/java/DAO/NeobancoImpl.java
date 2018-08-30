package DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import MODEL.NeobancoM;

@Repository
public class NeobancoImpl implements NeobancoDao {

	
	@Autowired
	private SessionFactory session;
	
	
	@Override
	public void add(NeobancoM neobanco) {

		session.getCurrentSession().save(neobanco);
	}

	@Override
	public void edit(NeobancoM neobanco) {
		session.getCurrentSession().update(neobanco);
	}

	@Override
	public void delete(int neobancoId) {
		session.getCurrentSession().delete(getNeobancoM(neobancoId));

	}

	@Override
	public NeobancoM getNeobancoM(int neobancoId) {
		return (NeobancoM)session.getCurrentSession().get(NeobancoM.class, neobancoId); 
	}

	@Override
	public List getNeobancos() {
	return session.getCurrentSession().createQuery("from Neobanco").list();
	}

}
