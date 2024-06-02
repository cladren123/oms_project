# 상품 조회 (최신순) API 



## 요청

* 주소

``` 
GET / localhost:8080/item/page/latest?page=5
```



* 입력값

RequestParam으로 Page 번호 입력 

<br>



## 응답

* 성공 (10개 출력)
  * currentPage : 현재 페이지
  * totalPages : 전체 페이지
  * totalcontents : 전체 데이터 개수 
  * contents : 페이지에 표시할 데이터 


```
status code : 200 (OK)

{
    "currentPage": 1,
    "totalPages": 1000,
    "totalContents": 10000,
    "contents": [
        {
            "itemSeq": 10000,
            "brandName": "그라미치",
            "itemName": "itemName10000",
            "itemPrice": 100000
        },
        {
            "itemSeq": 9999,
            "brandName": "유니톰브릿지",
            "itemName": "itemName09999",
            "itemPrice": 29000
        },
        {
            "itemSeq": 9998,
            "brandName": "그라미치",
            "itemName": "itemName09998",
            "itemPrice": 62000
        },
        {
            "itemSeq": 9997,
            "brandName": "유니톰브릿지",
            "itemName": "itemName09997",
            "itemPrice": 37000
        },
        {
            "itemSeq": 9996,
            "brandName": "아디다스",
            "itemName": "itemName09996",
            "itemPrice": 9000
        },
        {
            "itemSeq": 9995,
            "brandName": "스파오",
            "itemName": "itemName09995",
            "itemPrice": 26000
        },
        {
            "itemSeq": 9994,
            "brandName": "반스",
            "itemName": "itemName09994",
            "itemPrice": 34000
        },
        {
            "itemSeq": 9993,
            "brandName": "반스",
            "itemName": "itemName09993",
            "itemPrice": 41000
        },
        {
            "itemSeq": 9992,
            "brandName": "에스피오나지",
            "itemName": "itemName09992",
            "itemPrice": 30000
        },
        {
            "itemSeq": 9991,
            "brandName": "스파오",
            "itemName": "itemName09991",
            "itemPrice": 20000
        }
    ]
}
```





* 예외 

범위 밖에 페이지를 입력한 경우 

```
status code : 400 (Bad Request)
{
    "success": false,
    "message": "페이지 번호가 유효 범위를 벗어났습니다. 총 페이지 수 : 1000 입력된 페이지 : 0"
}
```



잘못된 파라미터로 입력한 경우 

```
status code : 400 (Bad Request)
{
    "success": false,
    "message": "잘못된 파라미터 입력: page는(은) int 타입이어야 합니다. 입력된 값: c"
}
```


