#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// qsort 함수에 사용될 비교 함수 정의
int compare(const void *a, const void *b) {
    return (*(int*)a - *(int*)b);
}

int* solution(int num_list[], size_t num_list_len) {
    // num_list를 정렬
    qsort(num_list, num_list_len, sizeof(int), compare);
    
    // 가장 작은 5개를 제외한 요소 개수 계산
    int result_len = num_list_len - 5;
    
    // 결과를 저장할 배열 동적 할당
    int* answer = (int*)malloc(result_len * sizeof(int));
    
    // 가장 작은 5개의 수를 제외하고 배열에 복사
    for (int i = 0; i < result_len; i++) {
        answer[i] = num_list[i + 5];
    }
    
    return answer;
}