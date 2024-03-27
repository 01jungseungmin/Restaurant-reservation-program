package com.proj.restreserve.board.repository;

import com.proj.restreserve.board.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeRepository extends JpaRepository <Notice,String> {
    List<Notice> findByNoticeid(String noticeid);

}
