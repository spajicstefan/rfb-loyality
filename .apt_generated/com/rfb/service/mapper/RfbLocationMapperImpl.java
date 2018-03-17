package com.rfb.service.mapper;

import com.rfb.domain.RfbLocation;
import com.rfb.service.dto.RfbLocationDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-03-18T00:22:21+0100",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 3.13.0.v20170516-1929, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
public class RfbLocationMapperImpl implements RfbLocationMapper {

    @Override
    public RfbLocationDTO toDto(RfbLocation entity) {
        if ( entity == null ) {
            return null;
        }

        RfbLocationDTO rfbLocationDTO = new RfbLocationDTO();

        rfbLocationDTO.setId( entity.getId() );
        rfbLocationDTO.setLocationName( entity.getLocationName() );
        rfbLocationDTO.setRunDayOfWeek( entity.getRunDayOfWeek() );

        return rfbLocationDTO;
    }

    @Override
    public List<RfbLocation> toEntity(List<RfbLocationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<RfbLocation> list = new ArrayList<RfbLocation>( dtoList.size() );
        for ( RfbLocationDTO rfbLocationDTO : dtoList ) {
            list.add( toEntity( rfbLocationDTO ) );
        }

        return list;
    }

    @Override
    public List<RfbLocationDTO> toDto(List<RfbLocation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<RfbLocationDTO> list = new ArrayList<RfbLocationDTO>( entityList.size() );
        for ( RfbLocation rfbLocation : entityList ) {
            list.add( toDto( rfbLocation ) );
        }

        return list;
    }

    @Override
    public RfbLocation toEntity(RfbLocationDTO rfbLocationDTO) {
        if ( rfbLocationDTO == null ) {
            return null;
        }

        RfbLocation rfbLocation = new RfbLocation();

        rfbLocation.setId( rfbLocationDTO.getId() );
        rfbLocation.setLocationName( rfbLocationDTO.getLocationName() );
        rfbLocation.setRunDayOfWeek( rfbLocationDTO.getRunDayOfWeek() );

        return rfbLocation;
    }
}
