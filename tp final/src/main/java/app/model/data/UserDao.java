package app.model.data;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface UserDao extends JpaRepository<User, Long> {

	public User findByUsr(String usr);
}
