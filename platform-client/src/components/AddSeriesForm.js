import React from "react";
import "./AddSeriesForm.css";

class AddSeriesForm extends React.Component {
  constructor(props) {
      super(props);

      this.handleSubmit = this.handleSubmit.bind(this);
      this.state = {
          message: ""
      };
      
  }


  handleSubmit(event) {
    event.preventDefault();
    var formData = new FormData(event.target);

    var data = {
        "name": formData.get("name"),
        "numberOfSeasons": formData.get("numberOfSeasons"),
        "idCategory": formData.get("idCategory"),
        "idPlatform": formData.get("idPlatform")
    };
    var self = this;

    fetch("http://localhost:8080/series/add", {
        method: "POST",
        body: JSON.stringify(data),
        headers: {
            'Content-Type': 'application/json'
        }
    })
    .then(function (response) {
        return response.json();
    })
    .then(function (result) {
        if (result.success) {
            self.setState({
                message: "Datele au fost salvate cu succes !"
            });
        } else {
            self.setState({
                message: "Error, the saving failed !"
            });
        }
    })

  }

  render() {
    return (
      <form className="add-series" onSubmit={this.handleSubmit}>
        <h2>Add series</h2>

        {this.state.message && 
            <div id="message">
                {this.state.message}
            </div>
        }

        <div className="field">
          <label htmlFor="">Name</label>
          <input type="text" name="name" />
        </div>

        <div className="field">
          <label htmlFor="">Number of seasons</label>
          <input type="number" name="numberOfSeasons" />
        </div>

        <div className="field">
          <label htmlFor="">Id Category</label>
          <input type="number" name="idCategory" />
        </div>

        <div className="field">
          <label htmlFor="">Id Platform</label>
          <input type="number" name="idPlatform" />
        </div>

        <button id="send-btn">Trimite</button>
      </form>
    );
  }
}

export default AddSeriesForm;
