package com.animal.shelter;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.animal.shelter.mapper.UserMapper;
import com.animal.shelter.vo.User;

@SpringBootTest
class ShelterProjectApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void findAllTest() {
		List<User> users = userMapper.findAll();
		assertThat(users).isNotNull();
		assertThat(users.size()).isGreaterThan(0); // 이 부분은 실제 DB 데이터에 따라 다르게 설정해야 할 수도 있습니다.
	}

}
