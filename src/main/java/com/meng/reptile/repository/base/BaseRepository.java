package com.meng.reptile.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 *<p><b>所有DAO类接口的原型</b></p>
 *<p> 其他Entity的DAO类接口均继承此接口
 * @version: 0.1
 */
@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {
}
