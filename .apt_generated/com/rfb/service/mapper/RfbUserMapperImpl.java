package com.rfb.service.mapper;

import com.rfb.domain.RfbLocation;
import com.rfb.domain.RfbUser;
import com.rfb.service.dto.RfbUserDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-03-18T00:13:07+0100",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 3.13.0.v20170516-1929, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
public class RfbUserMapperImpl implements RfbUserMapper {

    @Autowired
    private RfbLocationMapper rfbLocationMapper;

    @Override
    public List<RfbUserDTO> toDto(List<RfbUser> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<RfbUserDTO> list = new ArrayList<RfbUserDTO>( arg0.size() );
        for ( RfbUser rfbUser : arg0 ) {
            list.add( toDto( rfbUser ) );
        }

        return list;
    }

    @Override
    public List<RfbUser> toEntity(List<RfbUserDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<RfbUser> list = new ArrayList<RfbUser>( arg0.size() );
        for ( RfbUserDTO rfbUserDTO : arg0 ) {
            list.add( toEntity( rfbUserDTO ) );
        }

        return list;
    }

    @Override
    public RfbUserDTO toDto(RfbUser rfbUser) {
        if ( rfbUser == null ) {
            return null;
        }

        RfbUserDTO rfbUserDTO = new RfbUserDTO();

        Long id = rfbUserHomeLocationId( rfbUser );
        if ( id != null ) {
            rfbUserDTO.setHomeLocationId( id );
        }
        rfbUserDTO.setId( rfbUser.getId() );
        rfbUserDTO.setUsername( rfbUser.getUsername() );

        return rfbUserDTO;
    }

    @Override
    public RfbUser toEntity(RfbUserDTO rfbUserDTO) {
        if ( rfbUserDTO == null ) {
            return null;
        }

        RfbUser rfbUser = new RfbUser();

        rfbUser.setHomeLocation( rfbLocationMapper.fromId( rfbUserDTO.getHomeLocationId() ) );
        rfbUser.setId( rfbUserDTO.getId() );
        rfbUser.setUsername( rfbUserDTO.getUsername() );

        return rfbUser;
    }

    private Long rfbUserHomeLocationId(RfbUser rfbUser) {
        if ( rfbUser == null ) {
            return null;
        }
        RfbLocation homeLocation = rfbUser.getHomeLocation();
        if ( homeLocation == null ) {
            return null;
        }
        Long id = homeLocation.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
