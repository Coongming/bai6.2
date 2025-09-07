<form action="survey" method="post" class="form-card">
  <label>Email</label>
  <input name="email" type="email" required>

  <label>First Name</label>
  <input name="firstName" type="text" required>

  <label>Last Name</label>
  <input name="lastName" type="text" required>

  <fieldset>
    <legend>How did you hear about us?</legend>
    <label><input type="radio" name="heardFrom" value="Search Engine" checked> Search Engine</label>
    <label><input type="radio" name="heardFrom" value="Word of Mouth"> Word of Mouth</label>
    <label><input type="radio" name="heardFrom" value="Social Media"> Social Media</label>
    <label><input type="radio" name="heardFrom" value="Other"> Other</label>
  </fieldset>

  <label><input type="checkbox" name="updates" value="yes"> Receive updates?</label>

  <label>Please contact me by</label>
  <select name="contactVia">
    <option>Email or postal mail</option>
    <option>Email only</option>
    <option>Postal mail only</option>
  </select>

  <button type="submit">Submit</button>
</form>
