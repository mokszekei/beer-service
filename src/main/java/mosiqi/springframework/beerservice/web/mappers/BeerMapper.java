package mosiqi.springframework.beerservice.web.mappers;

import mosiqi.springframework.beerservice.domain.Beer;
import mosiqi.springframework.beerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class} )
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
