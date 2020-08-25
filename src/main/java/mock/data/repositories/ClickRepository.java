package mock.data.repositories;

import mock.data.models.Click;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClickRepository extends CrudRepository<Click, Long> {}
