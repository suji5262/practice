package hello.login.web.session;

import hello.login.domain.member.Member;
import org.apache.coyote.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.assertj.core.api.Assertions.assertThat;

class SessionManagerTest {

     SessionManager sessionManager = new SessionManager();

     @Test
    void sessionTest() {

         //세션 생성
         MockHttpServletResponse response = new MockHttpServletResponse();
         Member member = new Member();
         sessionManager.createSession(member, response);

         //요청한 응답 쿠키저장
         MockHttpServletRequest request = new MockHttpServletRequest();
         request.setCookies(response.getCookies());

         //세션조회
         Object result = sessionManager.getSession(request);
         assertThat(result).isEqualTo(member);

         //세션만료
          sessionManager.expire(request);
          Object expired = sessionManager.getSession(request);
          assertThat(expired).isNull();

     }
}
