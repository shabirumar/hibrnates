package com.data.hibrnates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner
{
    private SchoolRepository schoolRepository;
    @Autowired
    public DatabaseSeeder(SchoolRepository schoolRepository)
    {
        this.schoolRepository=schoolRepository;
    }
    @Override
    public void run(String... args) throws Exception
    {
        School school=new School("umar","sahiwal");
        schoolRepository.save(school);
        System.out.println(schoolRepository.findAll());
    }
}
