package io.hhplus.hhplus_02_clean_architecture.infra.entity

import jakarta.persistence.*
import org.hibernate.annotations.Comment
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime


@Entity
@Table(name = "lecture_history")
data class LectureHistoryEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("특강 신청 내역 id")
    val id: Long?,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lecture_schedule_id")
    var lectureSchedule: LectureScheduleEntity,

    @Column
    @Comment("유저 id")
    var userId: Long,
) : BaseCreateDateTimeEntity()