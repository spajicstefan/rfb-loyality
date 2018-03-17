package com.rfb.service.mapper;

import com.rfb.domain.RfbEvent;
import com.rfb.service.dto.RfbEventDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-03-18T00:13:03+0100",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 3.13.0.v20170516-1929, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
public class RfbEventMapperImpl implements RfbEventMapper {

    @Autowired
    private RfbLocationMapper rfbLocationMapper;

    @Override
    public List<RfbEvent> toEntity(List<RfbEventDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<RfbEvent> list = new ArrayList<RfbEvent>( dtoList.size() );
        for ( RfbEventDTO rfbEventDTO : dtoList ) {
            list.add( toEntity( rfbEventDTO ) );
        }

        return list;
    }

    @Override
    public List<RfbEventDTO> toDto(List<RfbEvent> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<RfbEventDTO> list = new ArrayList<RfbEventDTO>( entityList.size() );
        for ( RfbEvent rfbEvent : entityList ) {
            list.add( toDto( rfbEvent ) );
        }

        return list;
    }

    @Override
    public RfbEventDTO toDto(RfbEvent rfbEvent) {
        if ( rfbEvent == null ) {
            return null;
        }

        RfbEventDTO rfbEventDTO = new RfbEventDTO();

        rfbEventDTO.setRfbLocationDTO( rfbLocationMapper.toDto( rfbEvent.getRfbLocation() ) );
        rfbEventDTO.setId( rfbEvent.getId() );
        rfbEventDTO.setEventDate( rfbEvent.getEventDate() );
        rfbEventDTO.setEventCode( rfbEvent.getEventCode() );

        return rfbEventDTO;
    }

    @Override
    public RfbEvent toEntity(RfbEventDTO rfbEventDTO) {
        if ( rfbEventDTO == null ) {
            return null;
        }

        RfbEvent rfbEvent = new RfbEvent();

        rfbEvent.setRfbLocation( rfbLocationMapper.toEntity( rfbEventDTO.getRfbLocationDTO() ) );
        rfbEvent.setId( rfbEventDTO.getId() );
        rfbEvent.setEventDate( rfbEventDTO.getEventDate() );
        rfbEvent.setEventCode( rfbEventDTO.getEventCode() );

        return rfbEvent;
    }
}
