import java.io.*;
import java.util.*;

public class Main {		
	static int result;    // 결과값 저장
	static int counter;   // 현재 문제의 점수를 저장
	static char[] ch;     // 정답 여부를 저장할 리스트
	
	public static void main(String[] args) throws Exception {
		// 기본 설정 부분
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
        // 첫번째 입력 (test_case)
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		for (int test_case = 0; test_case < T ; test_case++) {
			// 초기화
			result = 0;
			counter = 0;
			
            // OX를 입력받고, char 배열로 변경
			st = new StringTokenizer(br.readLine());
			ch = st.nextToken().toCharArray();
			
            // ch 배열에 들어있는 값을 일일이 추출
			for (char c : ch) {
				if (c == 'O') {        // c에 들어있는 값이 'O' 와 같은지 비교
					counter += 1;      // 이 문제의 점수 지정
					result += counter; // 결과값에 더해주기
				} else {
					counter = 0;       // 아닐 경우 문제 점수 시작점을 0으로 초기화
				}
			}
			
			sb.append(result).append("\n").toString(); // stringbuilder에 string 형태로 저장
		}
		
		System.out.println(sb);     // 한 번에 출력
		
		br.close();        // br 닫아주기
	}
}