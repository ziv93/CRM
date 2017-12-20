package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.User;

/**
 * �û�Service�ӿ�
 *
 * @author Administrator
 */
public interface UserService {

    /**
     * �û���¼
     */
    User login(User user);

    /**
     * ��ѯ�û�����
     */
    List<User> find(Map<String, Object> map);

    /**
     * ��ȡ�ܼ�¼��
     */
    Long getTotal(Map<String, Object> map);

    /**
     * �޸��û�
     */
    int update(User user);

    /**
     * �����û�
     */
    int add(User user);

    /**
     * ɾ���û�
     */
    int delete(Integer id);
}