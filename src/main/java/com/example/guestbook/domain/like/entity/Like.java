package com.example.guestbook.domain.like.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(
        name = "likes",
        indexes = {
                @Index(name = "idx_member_id_post_id", columnList = "memberId, postId")
        }
)
@Entity
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long memberId;
    private Long postId;

    @Builder
    public Like(Long memberId, Long postId) {
        this.memberId = memberId;
        this.postId = postId;
    }
}
