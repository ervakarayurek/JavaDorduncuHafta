package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{

	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "Python"));
		languages.add(new Language(2, "C"));
		languages.add(new Language(3, "Java"));
		languages.add(new Language(4, "C++"));
		languages.add(new Language(5, "R"));

		
	}
	


	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public void add(Language language) {
		languages.add(language);
		
	}

	@Override
	public void delete(Language language) {
		languages.remove(language);
		
	}

	@Override
	public void update(String name, int id) {
		Language givenLanguage = getById(id);
		givenLanguage.setName(name);
		
	}



	@Override
	public Language getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
