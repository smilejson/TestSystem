package dao;

import entity.PersonalInfo;

public interface PersonalInfoMapper {

    PersonalInfo selectByPrimaryKey(Integer id);
}
