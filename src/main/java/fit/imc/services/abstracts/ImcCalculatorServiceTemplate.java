package fit.imc.services.abstracts;

import java.util.List;

import fit.imc.models.jpa.Person;
import fit.imc.view.PersonViewModel;

public interface ImcCalculatorServiceTemplate<T> {
    public List<PersonViewModel> getAll();
    public PersonViewModel calculate(PersonViewModel person);
    public Person getOne(Long Id);
}
