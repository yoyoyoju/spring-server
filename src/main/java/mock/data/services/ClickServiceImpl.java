package mock.data.services;

import mock.data.models.Click;
import mock.data.repositories.ClickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClickServiceImpl implements ClickService {
    private ClickRepository repository;

    @Autowired
    public ClickServiceImpl(ClickRepository repository) {
        this.repository = repository;
    }

    @Override 
    public List<Click> findAll() {
        return (List<Click>) repository.findAll();
    }

    @Override
    public Click insert(Click c) {
        return repository.save(c);
    }
}
