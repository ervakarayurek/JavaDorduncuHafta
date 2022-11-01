package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;


import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
	void add(Language language);
	void delete(Language language);
	public void update(String name, int id);
	public Language getById(int id);
}
