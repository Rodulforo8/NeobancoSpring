package SERVICES;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import MODEL.NeobancoM;
@Service
public class NeobancoImpl implements NeobancoService {

	@Transactional
	public void add(NeobancoM neobanco) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void edit(NeobancoM neobanco) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void delete(int neobancoId) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public NeobancoM getNeobancoM(int neobancoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List getNeobancos() {
		// TODO Auto-generated method stub
		return null;
	}

}
