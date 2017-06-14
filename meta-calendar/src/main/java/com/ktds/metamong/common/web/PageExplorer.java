package com.ktds.metamong.common.web;

public interface PageExplorer {

	/**
	 * JSP?��?�� Paging 결과�? 보여�??��.
	 * getPagingList?�� &lt;form> ?���? ?��?�� ?��?��?��?��?�� ?��?��.
	 * @param link Page 번호�? ?��?��?�� Parameter Name
	 * @param pageFormat Page 번호�? 보여�? ?��?�� @(at)�? ?��?���? 번호�? 치환?��?��. [@]�? ?��?��?�� 경우 [1] [2] [3] 처럼 보여진다.
	 * @param prev ?��?�� ?��?���? 그룹?���? �??�� 버튼?�� ?��름을 ?��?��?��?��.
	 * @param next ?��?�� ?��?���? 그룹?���? �??�� 버튼?�� ?��름을 ?��?��?��?��.
	 * @param formId ?��버에�? ?��?��?�� Form ?�� ?��?��?���? ?��?��?��?��.
	 * @return
	 */
	public String getPagingList(String link, String pageFormat, String prev, String next, String formId);
	
}
