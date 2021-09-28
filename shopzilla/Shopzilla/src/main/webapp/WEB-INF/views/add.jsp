<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<jsp:include page="cheader.jsp"></jsp:include>
<div class="col-sm-5">
					<div class='rounded bg-white p-2'>
						<h5 class="p-2" style="border-bottom:2px solid blue;">Address Details</h5>
						<form method="post" action="addresspass">
							<table class="table table-sm table-borderless border-bottom mb-2">
							
							
								<tr>
									<th>Enter Customer Name</th>
									<th><input type="text" name="cname" required 
										maxlength="16" class="form-control"></th>
								</tr>
								<tr>
									<th>Enter Mobile No</th>
									<th><input type="text" required name="cno"
										class="form-control"></th>
								</tr>
								<tr>
									<th>Address</th>
									<th><input type="text" required required
										class="form-control"></th>
								</tr>
								<tr>
									<th>Pincode</th>
									<th><input type="text" required maxlength="30"
										class="form-control"></th>
								</tr>
								
								<tr>
									<th>City</th>
									<th><input type="text" required maxlength="3"
										class="form-control"></th>
								</tr>
								
								<tr>
									<th>Country</th>
									<th><input type="text" required maxlength="3"
										class="form-control"></th>
								</tr>
								
								<tr>
									<td colspan="2"><input type="submit"
										class="btn btn-success float-right" value="Deliver to this Address">
									</td>
								</tr>
							</table>
						</form>
					</div>

				</div>