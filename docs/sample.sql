<!-- Footer -->
<footer class="page-footer font-small bg-primary">

    <!-- Copyright -->
    <div class="footer-copyright text-center py-3">� 2018 Copyright:
      <a href="https://mdbootstrap.com/education/bootstrap/"> MDBootstrap.com</a>
    </div>
    <!-- Copyright -->
    <button type="button" class="btn btn-primary btn-lg btn-block">Block level button</button>
    <button type="button" class="btn btn-default btn-lg btn-block">Block level button</button>
  </footer>
  <!-- Footer -->


  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>


drop TRIGGER updatePrnStudentTable;
DELIMITER //
create trigger updatePrnStudentTable
after insert 
on students
for each row

begin

DECLARE
vprn varchar(8);
DECLARE vid varchar(4);
 
 	select date_format(sysdate(),'%y%m4012') into vprn from dual;

  	select lpad(s_id,4,'0') into vid from students;

  	update students set old.s_prn=concat(vprn,vid);
END //
DELIMITER ;