1. Recibe PersonDto
2. Valida email
3. Crea PersonEntity
4. Copia datos del DTO a la entidad
5. Llama a save()
6. Hibernate guarda en BD
7. Devuelve el ID generado


    `PersonEntity person  = new PersonEntity();
    person.setName(personDto.getName());´
    person.setLastName(personDto.getLastName());
    person.setCarreer(personDto.getCarreer());
    person.setEmail(personDto.getEmail());
    person.setPhoneNumber(personDto.getPhoneNumber());
    PersonEntity createdPerson = personRepository.save(person);
          return createdPerson.getId();`