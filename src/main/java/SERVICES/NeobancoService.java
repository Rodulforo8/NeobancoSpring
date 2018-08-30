package SERVICES;

import java.util.List;

import MODEL.NeobancoM;

public interface NeobancoService {
	public void add(NeobancoM neobanco);
	public void edit(NeobancoM neobanco);
	public void delete(int neobancoId);
	public NeobancoM getNeobancoM(int neobancoId);
	public List getNeobancos();
}
