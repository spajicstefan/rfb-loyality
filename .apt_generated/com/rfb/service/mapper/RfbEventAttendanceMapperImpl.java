package com.rfb.service.mapper;

import com.rfb.domain.RfbEventAttendance;
import com.rfb.service.dto.RfbEventAttendanceDTO;
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
public class RfbEventAttendanceMapperImpl implements RfbEventAttendanceMapper {

    @Autowired
    private RfbEventMapper rfbEventMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<RfbEventAttendance> toEntity(List<RfbEventAttendanceDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<RfbEventAttendance> list = new ArrayList<RfbEventAttendance>( dtoList.size() );
        for ( RfbEventAttendanceDTO rfbEventAttendanceDTO : dtoList ) {
            list.add( toEntity( rfbEventAttendanceDTO ) );
        }

        return list;
    }

    @Override
    public List<RfbEventAttendanceDTO> toDto(List<RfbEventAttendance> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<RfbEventAttendanceDTO> list = new ArrayList<RfbEventAttendanceDTO>( entityList.size() );
        for ( RfbEventAttendance rfbEventAttendance : entityList ) {
            list.add( toDto( rfbEventAttendance ) );
        }

        return list;
    }

    @Override
    public RfbEventAttendanceDTO toDto(RfbEventAttendance rfbEventAttendance) {
        if ( rfbEventAttendance == null ) {
            return null;
        }

        RfbEventAttendanceDTO rfbEventAttendanceDTO = new RfbEventAttendanceDTO();

        rfbEventAttendanceDTO.setRfbEventDTO( rfbEventMapper.toDto( rfbEventAttendance.getRfbEvent() ) );
        rfbEventAttendanceDTO.setUserDTO( userMapper.userToUserDTO( rfbEventAttendance.getUser() ) );
        rfbEventAttendanceDTO.setId( rfbEventAttendance.getId() );
        rfbEventAttendanceDTO.setAttendanceDate( rfbEventAttendance.getAttendanceDate() );

        return rfbEventAttendanceDTO;
    }

    @Override
    public RfbEventAttendance toEntity(RfbEventAttendanceDTO rfbEventAttendanceDTO) {
        if ( rfbEventAttendanceDTO == null ) {
            return null;
        }

        RfbEventAttendance rfbEventAttendance = new RfbEventAttendance();

        rfbEventAttendance.setRfbEvent( rfbEventMapper.toEntity( rfbEventAttendanceDTO.getRfbEventDTO() ) );
        rfbEventAttendance.setUser( userMapper.userDTOToUser( rfbEventAttendanceDTO.getUserDTO() ) );
        rfbEventAttendance.setId( rfbEventAttendanceDTO.getId() );
        rfbEventAttendance.setAttendanceDate( rfbEventAttendanceDTO.getAttendanceDate() );

        return rfbEventAttendance;
    }
}
