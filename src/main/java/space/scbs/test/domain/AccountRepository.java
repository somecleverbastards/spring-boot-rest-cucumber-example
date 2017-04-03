package space.scbs.test.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path="/account")
public interface AccountRepository extends JpaRepository<Account, Long> {

	@Override
	@RestResource(exported=false)
	void delete(Account account);
	
	@Override
	@RestResource(exported=false)
	void deleteAll();
	
}
