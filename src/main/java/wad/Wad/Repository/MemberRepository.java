package wad.Wad.Repository;

import wad.Wad.Entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, String> {
    Boolean existsByUserId(String useId);
    Boolean existsByusername(String username);
    Boolean existsByEmail(String email);


}
