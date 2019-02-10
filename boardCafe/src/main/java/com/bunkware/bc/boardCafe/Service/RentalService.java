package com.bunkware.bc.boardCafe.Service;

import com.bunkware.bc.boardCafe.Dto.Rental;
import com.bunkware.bc.boardCafe.Repository.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentalService
{


    //how is all this going to work when we have to do queries more complicated then select and insert?
    private RentalRepository rentalRepository;
    @Autowired
    public RentalService(RentalRepository rentalRepository)
    {
        this.rentalRepository = rentalRepository;
    }

    public Rental createRental (double price, String desc, String name, int id, String rentalImagePath)
    {
        if(!rentalRepository.existsById(id))
        {
            rentalRepository.save(new Rental(price, desc, name, id, rentalImagePath));
        }
        return null;
    }

    public Iterable<Rental> lookup()
    {
        return rentalRepository.findAll();
    }

    public long total()
    {
        return rentalRepository.count();
    }

}
