package com.trainingcenter.servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class start extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// System.out.println(config.getInitParameter("TitelName"));
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html lang='eng'>");
		out.println("<head>");
		out.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
		out.println("<meta charset='UTF-8'>");
		out.println("<!-- Latest compiled and minified CSS -->");
		out.println(
				"<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'");
		out.println(
				"integrity='sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u' crossorigin='anonymous'>");
		out.println("<!-- Optional theme -->");
		out.println(
				"<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css'");
		out.println(
				"integrity='sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp' crossorigin='anonymous'>");
		out.println("<!-- Latest compiled and minified JavaScript -->");
		out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'");
		out.println("integrity='sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa'");
		out.println("crossorigin='anonymous'></script>");
		
		
		out.println("<script>");
		out.println("function validateInfo() {");
		out.println("var surName = document.getElementById('surName');");
		out.println("var firstName = document.getElementById('firstName');");
		out.println("var secretPHRASE = document.getElementById('secretPhrase');");
		out.println("var AGE = document.getElementById('age');");
		out.println("var course = document.getElementById('courseCombo');");
		out.println("var teachername = document.getElementById('teachername');");
		out.println("var assessmentCourse = document.getElementById('assessmentOfaCourseCombo');");
		out.println("var otherTEXT = document.getElementById('textOtherId');");
		out.println("var reg1 = /\\d/;");
		out.println("var reg2 = /[a-zA-Zа-яА-Я]/;");
		out.println("var reg3 = / /;");
		out.println("if (surName.value === '' ||");
		out.println("surName.value === null ||");
		out.println("surName.value.match(reg3) ) {");
		out.println("alert('«Фамилия» не может быть пустой');");
		out.println("return false;");
		out.println("} else if (surName.value.match(reg1)) {");
		out.println("alert('«Фамилия» не может содержать числа');");
		out.println("return false;");
		out.println("} else if (surName.value.match(reg3)) {");
		out.println("alert('«Фамилия» не может содержать пробел');");
		out.println("return false;");
		out.println("} else if (firstName.value === '' || firstName.value === null ) {");
		out.println("alert('«Имя» не может быть пустым');");
		out.println("return false;");
		out.println("} else if (firstName.value.match(reg1)) {");
		out.println("alert('«Имя» не может содержать числа');");
		out.println("return false;");
		out.println("} else if (firstName.value.match(reg3)) {");
		out.println("alert('«Имя» не может содержать пробел');");
		out.println("return false;");
		out.println("} else if (secretPHRASE.value === '' || secretPHRASE.value === null ) {");
		out.println("alert('«Секретная фраза» не может быть пустой');");
		out.println("return false;");
		out.println("} else if (AGE.value !== '') {");
		out.println("if (AGE.value.match(reg2)) {");
		out.println("alert('«Возрост» не может состоять из букв');");
		out.println("return false;");
		out.println("} else if (AGE.value <= 0) {");
		out.println("alert('«Возрост» не может быть меньше 1');");
		out.println("return false;");
		out.println("} else if (AGE.value > 120) {");
		out.println("alert('«Возрост» не может быть больше 120');");
		out.println("return false;");
		out.println("}");
		out.println(
				"} else if (!document.getElementById('gender_Male').checked && !document.getElementById('gender_Female').checked) {");
		out.println("alert('Укажите пол. Вы хто: М или Ж ?');");
		out.println("return false;");
		out.println("} else if (course.value === '') {");
		out.println("alert('Выберите Курс, который Вы проходили.');");
		out.println("return false;");
		out.println("} else if (teachername.value === '') {");
		out.println("alert('Укажите преподавателя, который вел курс.');");
		out.println("return false;");
		out.println("} else if (assessmentCourse.value === '') {");
		out.println("alert('Укажите, как Вы оценили курс.');");
		out.println("return false;");
		out.println("} else if (");
		out.println("document.getElementById('howDidYouHearAboutUs01').checked === false &&");
		out.println("document.getElementById('howDidYouHearAboutUs02').checked === false &&");
		out.println("document.getElementById('howDidYouHearAboutUs03').checked === false &&");
		out.println("document.getElementById('howDidYouHearAboutUs04').checked === false &&");
		out.println("document.getElementById('howDidYouHearAboutUs05').checked === false &&");
		out.println("document.getElementById('howDidYouHearAboutUsOTHER').checked === false) {");
		out.println("alert('Укажите, как Вы узнали о нас.');");
		out.println("return false;");
		out.println("} else if (document.getElementById('textOtherId').disabled === false &&");
		out.println("/^\\s+$/.test(otherTEXT.value)) {");
		out.println("alert('Отвергаешь – предлагай!');");
		out.println("return false;");
		out.println("}");
		out.println("else {");
		out.println("var hiddenValue = parseInt(document.getElementById('secretValue').value);");
		out.println("if (hiddenValue === 1) {");
		out.println("alert('Браво, честный человек! Смело отправляйся смотреть результат!');");
		out.println("return true;");
		out.println("}");
		out.println("if (hiddenValue === 2) {");
		out.println("return confirm('Вообще-то врать не хорошо, даже если не видят… Точно отправляем.');");
		out.println("}");
		out.println("}");
		out.println("return true;");
		out.println("}");
		out.println("function saveSecret(button) {");
		out.println("document.getElementById('secretValue').value = button;");
		out.println("}");
		out.println("function otherCheck() {");
		out.println("// Если поставлен флажок, снимаем блокирование кнопки");
		out.println("if (!document.getElementById('howDidYouHearAboutUsOTHER').checked) {");
		out.println("document.getElementById('howDidYouHearAboutUs01').disabled = 0;");
		out.println("document.getElementById('howDidYouHearAboutUs02').disabled = 0;");
		out.println("document.getElementById('howDidYouHearAboutUs03').disabled = 0;");
		out.println("document.getElementById('howDidYouHearAboutUs04').disabled = 0;");
		out.println("document.getElementById('howDidYouHearAboutUs05').disabled = 0;");
		out.println("document.getElementById('textOtherId').disabled = 1;");
		out.println("}");
		out.println("// В противном случае вновь блокируем кнопку");
		out.println("else {");
		out.println("document.getElementById('howDidYouHearAboutUs01').disabled = 1;");
		out.println("document.getElementById('howDidYouHearAboutUs02').disabled = 1;");
		out.println("document.getElementById('howDidYouHearAboutUs03').disabled = 1;");
		out.println("document.getElementById('howDidYouHearAboutUs04').disabled = 1;");
		out.println("document.getElementById('howDidYouHearAboutUs05').disabled = 1;");
		out.println("document.getElementById('howDidYouHearAboutUs01').checked = 0;");
		out.println("document.getElementById('howDidYouHearAboutUs02').checked = 0;");
		out.println("document.getElementById('howDidYouHearAboutUs03').checked = 0;");
		out.println("document.getElementById('howDidYouHearAboutUs04').checked = 0;");
		out.println("document.getElementById('howDidYouHearAboutUs05').checked = 0;");
		out.println("document.getElementById('textOtherId').disabled = 0;}}");
		out.println("function showOtherCourses() {");
		out.println("var valueCourse = document.getElementById('courseCombo');");
		out.println("if (valueCourse.value === 'Java SE') {");
		out.println("document.getElementById('otherCourse01').hidden = 1;");
		out.println("document.getElementById('otherCourse02').hidden = 0;");
		out.println("document.getElementById('otherCourse03').hidden = 0;");
		out.println("document.getElementById('otherCourse04').hidden = 0;");
		out.println("}");
		out.println("if (valueCourse.value === 'Java EE') {");
		out.println("document.getElementById('otherCourse02').hidden = 1;");
		out.println("document.getElementById('otherCourse01').hidden = 0;");
		out.println("document.getElementById('otherCourse03').hidden = 0;");
		out.println("document.getElementById('otherCourse04').hidden = 0;");
		out.println("}");
		out.println(
				"if (valueCourse.value === 'Тестирование корабельных якорей методом погружения в Северное Море') {");
		out.println("document.getElementById('otherCourse03').hidden = 1;");
		out.println("document.getElementById('otherCourse01').hidden = 0;");
		out.println("document.getElementById('otherCourse02').hidden = 0;");
		out.println("document.getElementById('otherCourse04').hidden = 0;");
		out.println("}");
		out.println("if (valueCourse.value === 'Вышивание крестиком в условиях, близких к невесомости') {");
		out.println("document.getElementById('otherCourse04').hidden = 1;");
		out.println("document.getElementById('otherCourse01').hidden = 0;");
		out.println("document.getElementById('otherCourse02').hidden = 0;");
		out.println("document.getElementById('otherCourse03').hidden = 0;}}");
		out.println("function javaScriptEnable() {");
		out.println("var primaryTable = document.getElementById('primaryTable');");
		out.println("primaryTable.onsubmit = 'return validateInfo()';}");
		out.println("function javaScriptDisable() {");
		out.println("var primaryTable = document.getElementById('primaryTable');");
		out.println("primaryTable.onsubmit = 'true';}");
		out.println("</script>");
		
		//out.println("<script src="+"/task02/script.js"+"></script>");
		
		out.println("<title>Lesson 03. Task 02.</title>");
		out.println("</head>");
		out.println("<body>");
		/*
		 * out.
		 * println("<h1 align='center'>Lesson 03 - Servlet API. Task 02. <br>");
		 * out.
		 * println("Электронная анкета для оценки качества образования.</h1>");
		 */

		out.println("<h1 align='center'>" + request.getServletContext().getInitParameter("TitelName01") + "<br>");
		out.println(request.getServletContext().getInitParameter("TitelName02") + "</h1>");
		out.println("<div class='container'>");
		out.println("<div class='col-xs-2'>Menu</div>");
		out.println("<div class='col-xs-8'>");
		out.println(
				"<form id='primaryTable' class='form-group' method='post' onsubmit= 'return validateInfo()' action='start2'>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td><label for='surName'>Фамилия </label></td>");
		out.println("<td><input type='text' class='form-control' id='surName' name='surName' placeholder='Коморов'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><label for='firstName'>Имя</label></td>");

		out.println(
				"<td><input type='text' class='form-control' id='firstName' name='firstName' placeholder='Артур'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><label for='patronymic'>Отчество </label></td>");
		out.println(
				"<td><input type='text' class='form-control' id='patronymic' name='patronymic' placeholder='Абрамович'>");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><label for='secretPhrase'>Секретная фраза : </label></td>");
		out.println(
				"<td><input type='password' class='form-control' id='secretPhrase' name='secretPhrase' placeholder='Всемирный секрет'");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><label for='age'>Возраст</label></td>");
		out.println("<td><input type='text' class='form-control' id='age' name='age' placeholder='33'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><label>Пол</label></td>");
		out.println(
				"<td><input type='radio' name='gender' id='gender_Male' value='Male'/> <label for='gender_Male'>Мужчина</label>");
		out.println("<br>");
		out.println("<input type='radio' name='gender' id='gender_Female' value='Female'/> <label");
		out.println("for='gender_Female'>Женщина</label>");
		out.println("");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><label>Курс</label></td>");
		out.println("<td>");
		out.println(
				"<label for='courseCombo'></label><select id='courseCombo' name='courseCombo' class='form-control' onchange='showOtherCourses()'>");
		out.println("<option value='' disabled selected></option>");
		out.println("<option value='Java SE'> Java SE</option>");
		out.println("<option value='Java EE'> Java EE</option>");
		out.println("<option value='Тестирование корабельных якорей методом погружения в Северное Море'>");
		out.println("Тестирование корабельных якорей методом погружения в Северное Море");
		out.println("</option>");
		out.println("<option value='Вышивание крестиком в условиях, близких к невесомости'> Вышивание крестиком в");
		out.println("условиях, близких к невесомости");
		out.println("</option>");
		out.println("</select>");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><label>Преподаватель </label></td>");
		out.println("<td>");
		out.println(
				"<label for='teachername'></label><select id='teachername' name='teachername' class='form-control'size='3'>");
		out.println("<option value='Соколов Андрей Федорович'> Соколов Андрей Федорович</option>");
		out.println("<option value='Петров Петр Петрович'> Петров Петр Петрович</option>");
		out.println("<option value='Сидоров Сидор Сидорович'> Сидоров Сидор Сидорович</option>");
		out.println("</select>");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><label for='assessmentOfaCourseCombo'>Оценка курса</label></td>");
		out.println("<td>");
		out.println("<select id='assessmentOfaCourseCombo' name='assessmentOfaCourseCombo' class='form-control'>");
		out.println("<option value='' disabled selected></option>");
		out.println("<option value='10'> 10</option>");
		out.println("<option value='100500'> 100500</option>");
		out.println("<option value='Мильен Мильярдов'> Мильен Мильярдов</option>");
		out.println("<option value='Еще пока нет такого числа'> Еще пока нет такого числа</option>");
		out.println("<option value='Это было даже лучше, чем 10 000 люстр от Карлсона!'> Это было даже лучше, чем");
		out.println("10 000 люстр от Карлсона!");
		out.println("</option>");
		out.println("</select>");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><label>Прочие курсы</label></td>");
		out.println("<td>");
		out.println(
				"<label for='otherCoursesCombo'></label><select id='otherCoursesCombo' name='otherCoursesCombo' multiple class='form-control'>");
		out.println("<option value='Java SE' id='otherCourse01' hidden> Java SE</option>");
		out.println("<option value='Java EE' id='otherCourse02' hidden> Java EE</option>");
		out.println("<option value='Тестирование корабельных якорей методом погружения в Северное");
		out.println("Море' id='otherCourse03' hidden> Тестирование корабельных якорей методом погружения в");
		out.println("Северное");
		out.println("Море");
		out.println("</option>");
		out.println("<option value='Вышивание крестиком в условиях, близких к невесомости' id='otherCourse04'");
		out.println("hidden> Вышивание крестиком в");
		out.println("условиях, близких к невесомости");
		out.println("</option>");
		out.println("</select>");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><label>Как Вы о нас узнали </label></td>");
		out.println("<td>");
		out.println("<p><label>");
		out.println("<input type='checkbox' name='howDidYouHearAboutUs01' id='howDidYouHearAboutUs01'");
		out.println(" value='Реклама по ТВ'>");
		out.println("</label> Реклама по ТВ</p>");
		out.println("<p><label>");
		out.println("<input type='checkbox' name='howDidYouHearAboutUs02' id='howDidYouHearAboutUs02'");
		out.println(" value='Реклама по радио'>");
		out.println("</label> Реклама по радио</p>");
		out.println("<p><label>");
		out.println("<input type='checkbox' name='howDidYouHearAboutUs03' id='howDidYouHearAboutUs03'");
		out.println(" value='Реклама в Internet'>");
		out.println("</label> Реклама в Internet</p>");
		out.println("<p><label>");
		out.println("<input type='checkbox' name='howDidYouHearAboutUs04' id='howDidYouHearAboutUs04'");
		out.println(" value='Реклама в метро'>");
		out.println("</label> Реклама в метро</p>");
		out.println("<p><label>");
		out.println(
				"<input type='checkbox' name='howDidYouHearAboutUs05' id='howDidYouHearAboutUs05' value='Тварь, какая-то мне этими буклетами весь почтовый ящик");
		out.println("зас#%ла'>");
		out.println("</label> Тварь, какая-то мне этими буклетами весь почтовый ящик");
		out.println("зас#%ла</p>");
		out.println("<p><label>");
		out.println("<input type='checkbox' id='howDidYouHearAboutUsOTHER' value='Другое' onclick='otherCheck()'>");
		out.println("</label> Другое</p>");
		out.println(
				"<label for='textOtherId'></label><textarea class='form-control' name='textOtherId' id='textOtherId' disabled></textarea>");
		out.println("");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><label>Прочие Рекомендации </label></td>");
		out.println(
				"<td><label for='otherRecommendations'></label><textarea class='form-control' name='otherRecommendations' id='otherRecommendations'></textarea>");
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("<p>");
		out.println("<input id='secretValue' name='secretValue' type='hidden' value=''/>");
		out.println("<input type='submit' id='button01' class='btn btn-primary' onclick='saveSecret(1);'");
		out.println(" value='Отправить – здесь все правда'/>");
		out.println("");
		out.println("<input type='submit' id='button02' class='btn btn-primary' onclick='saveSecret(2);'");
		out.println(" value='Отправить – я все равно все наврал'/>");
		out.println("");
		out.println("</p>");
		out.println("<p><label>Управление валидацией на странице при помощи JavaScript:</label>");
		out.println(
				"<label for='onOffnameON'></label><input type='radio' name='onOff' id='onOffnameON' value='on' checked onchange='javaScriptEnable()'> ON");
		out.println(
				"<label for='onOffnameOFF'></label><input type='radio' name='onOff' id='onOffnameOFF' value='off' onchange='javaScriptDisable()'> OFF");
		out.println("</p>");
		out.println("</form>");
		out.println("</div>");
		out.println("<div class='col-xs-2'>");
		out.println("реклама");
		out.println("</div>");
		out.println("</div>");
		out.println("</body>");
		out.println("");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
